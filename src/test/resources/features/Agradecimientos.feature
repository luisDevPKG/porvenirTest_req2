Feature: Agregar productos de la categoría "Agradecimientos" al carrito y validarlos en la opción "Carro".

  Scenario: Visualización de productos en la categoría "Agradecimientos"
    Given que estoy en la página principal de la tienda "https://www.floristeriamundoflor.com/"
    When selecciono la categoría "Agradecimientos"
    Then se visualizarán los productos para esta categoría