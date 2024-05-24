document.addEventListener('DOMContentLoaded', () => {
    const celularList = document.getElementById('celular-list');
    const addForm = document.getElementById('add-celular-form');
    const updateForm = document.getElementById('update-celular-form');
    const updateSelect = document.getElementById('update-celular-id');

    // Fetch and display celulares
    function fetchCelulares() {
        fetch('http://localhost:8080/celular/list')
            .then(response => response.json())
            .then(data => {
                celularList.innerHTML = '';
                updateSelect.innerHTML = '<option value="" disabled selected>Selecione um celular</option>';
                data.forEach(celular => {
                    const li = document.createElement('li');
                    li.textContent = `ID: ${celular.id}, Nome: ${celular.nome}, Modelo: ${celular.modelo}`;
                    const deleteButton = document.createElement('button');
                    deleteButton.textContent = 'Deletar';
                    deleteButton.onclick = () => deleteCelular(celular.id);
                    li.appendChild(deleteButton);
                    celularList.appendChild(li);

                    const option = document.createElement('option');
                    option.value = celular.id;
                    option.textContent = celular.nome;
                    updateSelect.appendChild(option);
                });
            })
            .catch(error => {
                console.error('Erro ao buscar celulares:', error);
            });
    }

    // Add new celular
    addForm.addEventListener('submit', (e) => {
        e.preventDefault();
        const nome = document.getElementById('celular-nome').value;
        const modelo = document.getElementById('celular-modelo').value;
        const celular = { nome, modelo };
        fetch('http://localhost:8080/celular/incluir', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(celular)
        })
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro ao adicionar celular');
            }
            fetchCelulares();
            addForm.reset();
        })
        .catch(error => {
            console.error('Erro ao adicionar celular:', error);
        });
    });

    // Update celular
    updateForm.addEventListener('submit', (e) => {
        e.preventDefault();
        const id = document.getElementById('update-celular-id').value;
        const nome = document.getElementById('update-celular-nome').value;
        const modelo = document.getElementById('update-celular-modelo').value;
        const celular = { id, nome, modelo };
        fetch('http://localhost:8080/celular/atualizar', {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(celular)
        })
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro ao atualizar celular');
            }
            fetchCelulares();
            updateForm.reset();
        })
        .catch(error => {
            console.error('Erro ao atualizar celular:', error);
        });
    });

    // Delete celular
    function deleteCelular(id) {
        fetch(`http://localhost:8080/celular/${id}`, {
            method: 'DELETE'
        })
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro ao deletar celular');
            }
            fetchCelulares();
        })
        .catch(error => {
            console.error('Erro ao deletar celular:', error);
        });
    }

    fetchCelulares();
});
