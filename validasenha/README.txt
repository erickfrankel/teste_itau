Domain Layer: A interface PasswordValidator define o contrato para a validação de senha.
Application Layer: PasswordValidationUseCase contém a lógica para validar uma senha usando o validador de senha definido na camada de domínio. 
PasswordValidatorService define um serviço que pode ser implementado para diferentes fontes de dados (ex. banco de dados, API externa).
Infrastructure Layer: PasswordValidatorImpl implementa a interface PasswordValidator com as regras de validação. 
PasswordValidatorController serve como um controlador simples para expor a funcionalidade de validação, 
aqui utilizando a entrada de console para demonstrar.
Main: Ponto de entrada que injeta as dependências e executa a validação.
Para executar o projeto, basta ir na classe main e clicar em Run, no console da IDE será possível digitar a senha e receber o retorno
de True ou False.