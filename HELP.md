Após importar a collection ao Postman, faça o post registration. Ela retorna o access token para acessar a api e a refresh
token para renovar o access token.

Para chamar o registration, deve estar habilitado o JWT Bearer na aba authorization, com HS256 e secret base64 encoded acionado

E então nas outras chamadas, na aba Authorization usa-se Bearer Token, com o Access Token do primeiro endpoint em seu valor.

Então, faça o post pet create, onde o pet será criado.

E então, pode dar get no pet após colocar o access_token. As informações virão.

Eu só pude fazer o projeto no fim de semana por estar muito ocupado durante a semana, então não criei mais endpoints do negócio
por cansaço, pois fiquei direto no desde sexta de noite. Porém seria mais do mesmo, com update, delete etc. Nada complicado.

Há um controlador para testes de Role, onde só aceita admin.

O Design Pattern ficou estranho, devo admitir, mas dá para entender.
Não ficou 100% agradável no código, mas estando tudo funcional, 
adicionar e melhorar fica tranquilo.

Eu acabei não fazendo Testes Umdnitários, achei mais importante mostrar outras partes.
