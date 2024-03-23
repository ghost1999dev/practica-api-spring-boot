<div align="center">
  <a href="http://spring.io/projects/spring-boot" target="blank"><img src="https://niixer.com/wp-content/uploads/2020/11/spring-boot.png" width="" height="200" alt="Spring Boot Logo" /></a>
</div>

<div align="center">Un marco de trabajo para crear aplicaciones Java basadas en Spring de manera rápida y con poco esfuerzo.</div>
<div align="center">
  <a href="https://start.spring.io/" target="_blank"><img src="https://img.shields.io/badge/spring--initializr-2.5.1-green" alt="Spring Initializr" /></a>
  <a href="https://github.com/spring-projects/spring-boot/blob/master/LICENSE.txt" target="_blank"><img src="https://img.shields.io/github/license/spring-projects/spring-boot" alt="License" /></a>
  <a href="https://github.com/spring-projects/spring-boot/actions?query=workflow%3A%22Build%22" target="_blank"><img src="https://github.com/spring-projects/spring-boot/workflows/Build/badge.svg" alt="Build Status" /></a>
  <a href="https://github.com/spring-projects/spring-boot/graphs/contributors" target="_blank"><img src="https://img.shields.io/github/contributors/spring-projects/spring-boot" alt="Contributors" /></a>
</div>

## API de Marvel - Spring Boot
Esta es una API en Spring Boot diseñada para consumir el API de Marvel y proporcionar información sobre personajes, cómics y más.
### Caracteristicas
- **Obtener el listado de comic que tiene un personajes especifico**: Obten informacion detallada sobre el comic de el personaje en especifico.
- **Obtener la imagen y la descripcion de un personaje en especifico**: Obtiene la descripcion y la imagen del personaje en especifico
- **Mostrar la lista de comic completas**: Obtiene la lista de comics completas
- **Mostrar comic filtrado por id**: Muestra la lista de comic por id
- **Mostrar las busquedas que cualquier usuario haya hecho relacionadas a historietas**:

### Endpoints Disponibles
- `localhost:8080/marvel/comics`: Endpoint para obtener la informacion de los comics.
- `localhost:8080/marvel/comics/{comicId}` Muestra la lista de comic por id.
- `localhost:8080/marvel/comics/{comicId}/characters` Muestra el listado de comic que tiene un personaje en especifico.
- `localhost:8080/marvel/characters/{characterId}` Muestra la imagen y descripcion de un personaje especifico. Ademas al ejecutar el endpoint alguna informacion se guarda en la base de datos de manera interna.


