
#listaDeTarefas = []
# tarefa = (id, "Tarefa", "[ ]");
# tarefaConcluida = (id, "Tarefa", "[X]");

# ou 
# tarefa = [id, "Tarefa", "[ ]"];
# tarefaConcluida = [id, "Tarefa", "[X]""];

# ou
# tarefa = {"id": 0, "tarefa": "Tarefa", "status": "[ ]"};
id = 0

def menu():
    '''
    Função que exibe o menu de opções
    1- Listar tarefas
    2- Registrar tarefa
    3- Marcas tarefa como concluída
    4- Editar tarefa
    5- Sair
    '''
    op = 1
    return op

def listar(listaDeTarefas):
    '''
    Função que exibe a lista de tarefas
    '''
    print('Listar tarefas')

def registrar(listaDeTarefas):
    '''
    Função que registra uma nova tarefa
    '''
    print('Registrar tarefa')

def marcarConcluida(listaDeTarefas):
    '''
    Função que marca uma tarefa como concluída
    '''
    print('Marcar tarefa como concluída')

def editar(listaDeTarefas):
    '''
    Função que edita uma tarefa
    '''
    print('Editar tarefa')

def main():
    listaDeTarefas = []
    while True:
        op = menu()
        if op == 1:
            print('Listar tarefas')
        elif op == 2:
            print('Registrar tarefa')
        elif op == 3:
            print('Marcar tarefa como concluída')
        elif op == 4:
            print('Editar tarefa')
        elif op == 5:
            print('Sair')
            break
        else:
            print('Opção inválida')

if __name__ == '__main__':
    main()
