# Autor de la Automatizacion: Felipe Ochoa Giraldo, felipe_ochoag@hotmail.com

Feature: Prueba de Automatizacion de SQA
  yo como automatizador
  Necesito interactuar con WebTables
  Para validar el funcionamiento

  Background:Navegar a la pagina
    Given 'Automatizador' Necesita navegar a la pagina "https://demoqa.com/"

  Scenario: Crear y Eliminar un usuario
    And Desea seleccionar la opcion de "Elements","WebTables" y "add"
    When Crea un usuario con los datos
      | first_name | Felipe             |
      | last_name  | Ochoa              |
      | email      | felipe@hotmail.com |
      | age        | 30                 |
      | salary     | 4000000            |
      | department | Antioquia          |
    And Elimina un usuario por el apellido "Ochoa"
    Then Valida que el texto "No rows found" exista

