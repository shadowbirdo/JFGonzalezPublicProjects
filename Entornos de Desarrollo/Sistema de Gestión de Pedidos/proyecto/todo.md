Estructura de clases
- [x] Clase Producto (abstracta o base)
- [x] Atributos comunes: nombre, precio.
- [x] Métodos: calcularPrecioFinal(), toString() o equivalente.
- [x] ProductoFisico: incluye atributo costeEnvio.
- [ ] ProductoDigital: incluye atributo tamañoDescarga o licencia.
- [x] Clase Cliente: con atributos básicos y métodos de acceso.
- [x] Clase Pedido: que contenga una lista de productos y un cliente.
- [ ] Métodos Pedido: agregarProducto(), calcularTotal(), mostrarResumen().
- [ ] Clase Main o App: para crear objetos y probar el sistema.​

Relaciones a representar
- [x]​ Herencia (Producto → ProductoFisico, ProductoDigital).
- [x]​ Asociación (Pedido → Cliente).
- [x] Agregación o composición (Pedido → Producto).