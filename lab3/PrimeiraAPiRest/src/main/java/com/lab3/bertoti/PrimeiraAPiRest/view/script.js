document.addEventListener('DOMContentLoaded', () => {
    const celularList = document.getElementById('celular-list');
    const addForm = document.getElementById('add-celular-form');
    const updateForm = document.getElementById('update-celular-form');
    const updateSelect = document.getElementById('update-celular-id');

    // Fetch and display celulares
    function fetchCelulares() {
        fetch('/celular')
            .then(response => response.json())
            .then(data => {
                celularList.innerHTML = '';
                updateSelect.innerHTML = '<option value="">Selecione um celular</option>'; // Clear and set default option
                data.forEach(celular => {
                    // Populate celular list
                    const li = document.createElement('li');
                    li.textContent = `ID: ${celular.id}, Nome: ${celular.nome}, Modelo: ${celular.modelo}`;
                    const deleteButton = document.createElement('button');
                    deleteButton.textContent = 'Deletar';
                    deleteButton.onclick = () => deleteCelular(celular.id);
                    li.appendChild(deleteButton);
                    celularList.appendChild(li);

                    // Populate update select
                    const option = document.createElement('option');
                    option.value = celular.id;
                    option.textContent = celular.nome;
                    updateSelect.appendChild(option);
                });
            });
    }

    // Add new celular
    addForm.addEventListener('submit', (e) => {
        e.preventDefault();
        const nome = document.getElementById('celular-nome').value;
        const modelo = document.getElementById('celular-modelo').value;
        fetch('/celular/incluir', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ nome, modelo })
        }).then(() => {
            fetchCelulares();
            addForm.reset();
        });
    });

    // Update celular
    updateForm.addEventListener('submit', (e) => {
        e.preventDefault();
        const id = document.getElementById('update-celular-id').value;
        const nome = document.getElementById('update-celular-nome').value;
        const modelo = document.getElementById('update-celular-modelo').value;
        fetch('/celular', {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ id, nome, modelo })
        }).then(() => {
            fetchCelulares();
            updateForm.reset();
        });
    });

    // Delete celular
    function deleteCelular(id) {
        fetch(`/celular/${id}`, {
            method: 'DELETE'
        }).then(() => {
            fetchCelulares();
        });
    }

    fetchCelulares();
});
