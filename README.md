# ElectroTech - Plataforma de Gestión de Inventario

Bienvenido a ElectroTech, una aplicación web diseñada para mejorar la gestión del inventario en la tienda de electrónicos del mismo nombre.

## Descripción del Proyecto

La tienda "ElectroTech" enfrentaba desafíos en la gestión de su inventario con un sistema manual. Para abordar estos problemas, se ha desarrollado esta aplicación web que permite una gestión eficiente del inventario, ayudando en el seguimiento preciso de productos, reordenación oportuna y reducción de errores en el control de existencias.

## Tecnologías Utilizadas

- Frontend: React.js
- Backend: Spring Boot (Java)
- Base de Datos: MySQL (compatible con PHPMyAdmin)
- Autenticación: JSON Web Tokens (JWT)
- API REST para la comunicación entre frontend y backend.

## Requisitos Previos

Asegúrese de tener instalados los siguientes componentes antes de comenzar:

- Node.js y npm (https://nodejs.org/)
- Java Development Kit (JDK) 11 (https://adoptopenjdk.net/)
- MySQL (https://dev.mysql.com/downloads/)
- PHPMyAdmin (https://www.phpmyadmin.net/)

## Pasos de Instalación

### Backend (Spring Boot)

1. Clonar el repositorio

```bash
git clone <URL_DEL_REPOSITORIO>
cd backend
````

2. Configuración de la Base de Datos

Cree una base de datos en MySQL llamada electrotech_db.
Actualice las configuraciones de la base de datos en src/main/resources/application.properties.

3. Ejecutar la aplicación

```bash
/mvnw spring-boot:run
````
El backend estará disponible en http://localhost:8080.

### Frontend (React)
1. En el directorio raíz del proyecto, navegue al directorio del frontend.
   
```bash
cd frontend
```
2. Instalar dependencias
   
```bash
npm install
```
3. Configurar la URL del backend
   
Actualice la URL del backend en el archivo src/config.js según la URL donde se esté ejecutando el backend.

5. Ejecutar la aplicación

```bash
npm start
```
La aplicación estará disponible en http://localhost:3000.

### Uso de la Aplicación
- Acceda a la aplicación desde su navegador utilizando la URL proporcionada después de ejecutar el frontend.
- Inicie sesión con las credenciales proporcionadas o cree una nueva cuenta.
- Explore las diversas funciones de gestión de inventario, informes de ventas y más.

### Contribuciones y Problemas
¡Las contribuciones son bienvenidas! Si encuentra algún problema o tiene ideas para mejoras, abra un problema en el repositorio.

### Licencia
- Este proyecto está bajo la Licencia MIT - vea el archivo LICENSE para más detalles.
