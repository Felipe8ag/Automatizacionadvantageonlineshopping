# Autor: Felipe Ochoa Giraldo, felipe_ochoag@hotmail.com

Feature: Prueba de Automatizacion de SQA
  Yo como automatizador
  Necesito interactuar con Alerts,Frame y Windows
  Para validar el funcionamiento

  Background:Navegar a la pagina
    Given 'Automatizador' Necesita navegar a la pagina "https://demoqa.com/"

  Scenario: Interactuar con Alertas
    And Desea seleccionar la opcion de "Alerts_Frame" y luego "Alerts"
    When Interactua con las Alertas y escribe el texto "Felipe"
    Then Valida que el texto "Felipe" exista
