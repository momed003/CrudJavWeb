$(document).ready(
        function () {
            callAllUsers();
        });
function getAllUsers() {
    $.ajax({
        url: "GetAllUsers",
        type: 'GET',
        dataType: 'json',
        data: {accao: 'getAllUsers'}
    }).done(function (response) {
        tableUsers(response);
        console.log(response);
    }).fail(function () {
        console.error("Erro ao buscar utilizadores");
    });
}

function callAllUsers() {
    $(document).on('click', '#btnUsers', function () {
        getAllUsers();
    });
}

function tableUsers(data) {
    const divUsers = $('.table_users');
    let div = '';
    div += '<div class="row">';
    div += '<div class="col-md-12">';
    div += '<h4>Tabela de Utilizadores</h4>';
    div += '<button class="btn btn-primary">Add Utilizador</button>';
    div += '<table class="table">';
    div += '<thead class="table-hover">';
    div += '<tr>';
    div += ' <th>#</th>';
    div += '<th>Utilizador</th>';
    div += ' <th>Email</th>';
    div += '<th>Data Criacao</th>';
    div += '<th>Data actualizacao</th>';
    div += '<th>Opcoes</th>';
    div += '</tr>';
    div += ' </thead>';
    div += '<tbody>';
    for (const value of data) {
        div += '<tr>';
        div += '<td>' + value.id + '</td>';
        div += '<td>' + value.username + '</td>';
        div += '<td>' + value.email + '</td>';
        div += '<td>' + value.created_at + '</td>';
        div += '<td>' + value.updated_at + '</td>';
        div += '<td>';
        div += '<button class="btn btn-outline-primary">Editar</button>';
        div += ' <button class="btn btn-outline-danger">Eliminar</button>';
        div += '</td>';
        div += '</tr>';
    }
    div += '</tbody>';
    div += '</table>';
    div += '</div>';
    div += '</div>';

    // Append the generated HTML to the div container
    divUsers.html(div);
}
;