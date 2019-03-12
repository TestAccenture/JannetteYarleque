#Author: j.yarleque.flores@accenture.com
#Keywords Summary : T
#Feature: Google Drive Test
#Scenario: Create a file in Google Drive
#Given: que Accenture Test Automation abre Google Chrome
#When: Se crea un archivo tipo Documento en Google Drive
#Then: El nombre del archivo debe contener "E01_<tu_nombre>_ fecha y hora exacta de la ejecución de la prueba"

@Feature1
Feature: Crear_un_documento_en_Google_Drive

COMO un usuario testaccenturedrive2019@gmail.com
QUIERO enviar crear un documento drive.
PARA exponer una introducción a la automatización de pruebas con Cucumber, y en lenguaje Gherkin.

#Background: Abrir el navegador en página de Gmail,y acceder con las credenciales de testaccenturedrive2019@gmail.com

@tag1
Scenario: Create_Document_Drive
Given que Accenture Test Automation abre su cuenta en Google Chrome
And se ingresa con usuario testaccenturedrive y contrasena testaccenturedrive2019
When Se crea un archivo tipo Documento en Google Drive 
Then El nombre del archivo debe contener