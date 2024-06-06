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
                updateSelect.innerHTML = '';
                data.forEach(celular => {
                    const li = document.createElement('li');
                    li.textContent = `ID: ${celular.id}, Marca: ${celular.marca}, Modelo: ${celular.modelo}`;
                    const deleteButton = document.createElement('button');
                    deleteButton.textContent = 'Deletar';
                    deleteButton.onclick = () => deleteCelular(celular.id);
                    li.appendChild(deleteButton);
                    celularList.appendChild(li);

                    const option = document.createElement('option');
                    option.value = celular.id;
                    option.textContent = celular.marca;
                    updateSelect.appendChild(option);
                });
            })
            .catch(error => console.error('Error fetching celulares:', error));
    }

    // Add new celular
    addForm.addEventListener('submit', (e) => {
        e.preventDefault();
        const marca = document.getElementById('celular-nome').value;
        const modelo = document.getElementById('celular-modelo').value;
        fetch('http://localhost:8080/celular/incluir', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ marca, modelo })
        }).then(() => {
            fetchCelulares();
            addForm.reset();
        }).catch(error => console.error('Error adding celular:', error));
    });

    // Update celular
    updateForm.addEventListener('submit', (e) => {
        e.preventDefault();
        const id = updateSelect.value;
        const marca = document.getElementById('update-celular-nome').value;
        const modelo = document.getElementById('update-celular-modelo').value;
        fetch(`http://localhost:8080/celular/atualizar/${id}`, { // Corrigido o endpoint
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ marca, modelo })
        }).then(() => {
            fetchCelulares();
            updateForm.reset();
        }).catch(error => console.error('Error updating celular:', error));
    });

    // Delete celular
    function deleteCelular(id) {
        fetch(`http://localhost:8080/celular/${id}`, {
            method: 'DELETE'
        }).then(() => {
            fetchCelulares();
        }).catch(error => console.error('Error deleting celular:', error));
    }

    fetchCelulares();
});
