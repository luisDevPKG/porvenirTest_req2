Feature: Agregar productos de la categoría Agradecimientos al carrito y validarlos en la opción Carro

  Scenario: Visualización de productos en la categoría Agradecimientos
    Given que estoy en la página principal de la tienda "https://www.floristeriamundoflor.com/"
    When selecciono la categoría "Agradecimientos"
    Then se visualizarán los productos para esta categoría

  Scenario: Añadir dos productos de la categoría Agradecimientos al carrito
    Given que estoy en la categoría "Agradecimientos"
    When hago clic en la opción "Añadir al carrito" para el primer producto
    And hago clic en la opción "Añadir al carrito" para el segundo producto
    Then el producto se agregará al carrito de compras
