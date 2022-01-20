# Autor de la Automatizacion: Felipe Ochoa Giraldo, felipe_ochoag@hotmail.com

Feature: Prueba de Automatizacion de SQA
  Yo como automatizador
  Necesito interactuar con Date Picker
  Para validar el funcionamiento

  Background:Navegar a la pagina
    Given 'Automatizador' Necesita navegar a la pagina "https://demoqa.com/"

  Scenario: Seleccionar una fecha en las opciones
    And Desea seleccionar la opcion de "Widgets" y "Date_Picker"
    When Ingresa la fecha con hora
      | day   | 01    |
      | month | March |
      | year  | 2024  |
      | hour  | 04:00 |
    Then Valida que la fecha "03/01/2024" exista