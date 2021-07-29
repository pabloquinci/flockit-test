# flockit-test - Backend de Login y Api de Provincias

# Se definieron Las capas de Modelo, con las clases correspondientes al modelo de negocio User, Provincia y el Rol del usuario; Repository, con las implementaciones a JpaRepository para conexion a la base de datos relacional Postgres; DTO, para el manejo de request y respuestas para desacoplar del modelo de negocio, Controller, el punto de entrada a las API's REST definidas para el login y registro de usuario, y el controller para las provincias que consume la API que expone toda la info de las mismas; Modulo de Spring Security que se divide en varias etapas:
         #Configuracion: defino el tipo de encriptacion de la password, las urls que necesitaran autenticacion y aquellas que no, inyeccion de la interface que tomara los datos de del usuario que intenta loguearse (en este caso en la base de datos Postgress), el handler para usuarios no autorizados
         #UserDetailsIml que me permite añadir campos adicionales al objeto del User que se loguea
         #UserDetailsServiceImpl implementa interface UserDetailsService que actua de DAO, en este caso con la base de datos, que se inyecta en la configuracion.
         #AuthTokenFilter en esta clase se ingresa al metodo doFilterInternal cada vez que se realiza un request, y valida si existe un token. Si existe obtiene el nombre de       usuario del token. Se crea un objeto de tipo Authentication que se setea en el SecurityContext
         # AuthEntryPointJwt> implementa el manejo de Excepciones de autenticacion, agregandole un log de error
         JWTUtils, contiene los metodos para encriptar y desencriptar los token
         
