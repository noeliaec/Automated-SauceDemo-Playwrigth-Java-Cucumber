Feature: Login en Sauce Demo

  Background:
    Given que el usuario abre la página de Sauce Demo

  @login @smoke
  Scenario: Usuario válido ingresa al inventario
    When ingresa "standard_user" y "secret_sauce"
    Then debería ver la lista de productos

  @login
  Scenario: Login fallido con usuario inválido
    When ingresa "user" y "pass"
    Then debería ver un mensaje de error indicando credenciales incorrectas
