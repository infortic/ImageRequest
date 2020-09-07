Esta API é apenas um mock para testar umas das funcionalidades da API "ProcessClearDump", a mesma pode ser acessada no seguinte link https://github.com/infortic/clenarDump

### Pré-requisitos
* Java 8
* Maven
### Passo a passo


#### 1 - Subir a API "ImageRequest"
`Faça o download da API no link: https://github.com/infortic/ImageRequest`

`1.A - ` Dentro do diretório root da aplicação execute:

`$ mvn clean install`   --  Para buildar a aplicação


`1.B - ` Agora acesse a diretorio `target/` criado no passo anterior e execute:

`$ java -jar ImageRequest-0.0.1.jar`

#isso fará com que a aplicação esteja respondendo a requicicopes do tipo GET no seguinte padrão de url: 

`http://localhost:4567/images/{6.png}`

