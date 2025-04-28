Feature: Login en Sauce Demo

  @login
  Scenario: Usuario válido ingresa al inventario
    Given que el usuario abre la página de Sauce Demo
    When ingresa "standard_user" y "secret_sauce"
    Then debería ver la lista de productos
