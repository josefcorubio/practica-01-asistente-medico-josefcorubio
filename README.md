# Práctica 1: Creación de un asistente médico

## Enunciado

Se trata de crear un servicio REST que exponga un recurso en el que se recibirá como parámetro un síntoma presentado por el usuario.

El servicio responderá con un texto indicando a qué se debe la posible dolencia o síntoma, incluyendo siempre recomendación de acudir a especialista.

**Desarrollo de la práctica**: al finalizar el Tema 2.

## Cómo empezar

1. Pulsa el botón **`Use this template`** (arriba a la derecha de este repositorio) → **`Create a new repository`**.
2. Elige **tu cuenta personal** como propietario (no la organización del curso).
3. Nombra tu repositorio como: `practica-01-asistente-medico-<tu-nombre>`.
4. Clona tu nuevo repositorio y desarrolla la práctica sobre él.
5. Haz commits descriptivos a medida que avanzas.

## Entrega

Copia el enlace de tu repositorio y pégalo en la entrega correspondiente de la plataforma.

Este ejercicio es voluntario y está pensado para que pongas en práctica los conocimientos adquiridos y consolides lo aprendido en los módulos teóricos.

- 📌 La entrega de estos ejercicios es completamente opcional y no influye en la nota final del curso.
- 📌 Si decides realizarlos, el profesor los corregirá y te dará feedback personalizado sobre tu trabajo.
- 📌 Estos ejercicios tampoco afectan a la bonificación del curso a través de Fundae.
- 📌 En caso de completar los ejercicios voluntarios y obtener una calificación igual o superior a 5, TrainingIT emitirá un certificado adicional e independiente al de Fundae, reflejando una evaluación positiva de las acciones prácticas realizadas durante el curso.

## Ejemplo de uso

### Requisitos

- Java 21
- [Ollama](https://ollama.com) en ejecución en `http://localhost:11434` con el modelo `llama3` descargado:

```bash
ollama pull llama3
ollama serve
```

### Configuración del microservicio

El servicio arranca en el puerto **8001**.

### Consultar un síntoma

**Endpoint:** `GET /api/asistente/sintoma?sintoma=<síntoma>`

Desde el navegador:

```
http://localhost:8001/api/asistente/sintoma?sintoma=dolor de cabeza
```

**Respuesta de ejemplo**:

```text
El dolor de cabeza frecuente puede tener varias causas. Algunas de las más comunes son:

* Tensión o estrés: ...
* Migraña: ...
* Falta de sueño: ...
* Problemas dentales: ...
* Problemas vasculares: ...

Es importante mencionar que el dolor de cabeza puede ser un síntoma de una condición
médica subyacente [...]

Recomiendo que consultes con un neurólogo o un médico general para que evalúen
y diagnostiquen el dolor de cabeza.
```

