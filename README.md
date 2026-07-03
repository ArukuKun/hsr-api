Nombre del Proyecto: [hsr-api]
📝 Descripción
Este proyecto consiste en el desarrollo y despliegue de un microservicio para [describir brevemente el propósito, ej: la gestión de personajes de Honkai: Star Rail], utilizando Kotlin y el framework Spring Boot. El objetivo es implementar un flujo automatizado de DevSecOps.

🚀 Arquitectura y Tecnologías
Lenguaje: java.

Framework: Spring Boot.

Contenedorización: Docker (Docker Compose para entorno local).

Infraestructura en la nube: AWS EKS (Amazon Elastic Kubernetes Service).

CI/CD: GitHub Actions (automatización de despliegue).

Seguridad: Integración de SonarCloud y Snyk en el pipeline para análisis de calidad y vulnerabilidades.

☁️ Despliegue en AWS (Arquitectura de Nodos)
El proyecto está configurado para ejecutarse en un clúster de EKS. El pipeline de GitHub Actions realiza los siguientes pasos automáticamente:

Build: Compilación del proyecto y paso de tests.

Security Check: Análisis con Snyk y SonarCloud.

Containerization: Creación de la imagen Docker y subida a Amazon ECR.

Deploy: Actualización del despliegue en el clúster EKS.

👤 Autor
Matias Espinoza - Estudiante en Duoc UC.

Aprendizaje: Pude montar bien un microservicio incluyendo implementaciones de seguridad como lo son SonarCloud y Snyk, 
mejorando la profensionalidad de esta api, y a la vez, mejorando mi percepcion para este tipo de trabajos.
