@DemoApp
Feature: Validar la funcionalidad del carrito de compras Demo App


  @DemoApp2
  Scenario Outline: Agregar productos al carrito
    Given estoy en la aplicación
    And valido que carguen correctamente los productos en la galería
    When doy clic en "<PRODUCTO>"
    And agrego <UNIDADES> del producto
    Then valido que el carrito de compras se actualice correctamente con la cantidad ingresada <UNIDADES>

    Examples:
      | PRODUCTO                    | UNIDADES |
      | Sauce Labs Backpack         | 1        |
      | Sauce Labs Bolt T-Shirt     | 1        |
      | Sauce Labs Bike Light       | 2        |
