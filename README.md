### Topic
- [APP](#app)
- [Modular hexagonal](#modular-hexagonal)
- [Designer Pattern](#designer-pattern)
- [Modules](#modules)
- [Badges](#badges)
- [Requirements](#requirements)
- [Getting Started](#getting-started)

## APP
Project developed to explore architectural principles, this project was did in modular hexagonal, and has been used the designer pattern Structures and Chain of responsibility
</br>

## Modular hexagonal
* modular hexagonal - The hexagonal architecture is based on independent and well-defined modules, which facilitates the maintenance and evolution of the system. Each module has clear responsibilities and can be developed, tested and replaced in isolation, without impacting the rest of the system.
</br>

## Designer Pattern
* `Designer Pattern Structural` is concerned with how classes and objects can be composed, to form larger structures. The structural design patterns simplifies the structure by identifying the relationships. These patterns focus on, how the classes inherit from each other and how they are composed from other classes.
</br></br>
* `Designer PatternThe Chain of Responsibility` design pattern is a behavioral pattern that allows requests to be passed along a chain of handlers until one of them processes them.
</br>

### Modules
* All modules have their own responsibility, SOLID was applied to modules, classes, methods and dependencies. <br />
  Here are the details of the modules:

`Core:` It executes the product specific rules, which is why this module is small.

`Domain:` Manages input, output, common items, ports and must not have business rules or dependencies..

`Integration:` Manages internal and external microservice calls and should not have business rules in mapper (mapping)
or within adapters as this layer is only for API calls.

`Orchestrator:` Manages the rules according to the strategies, as this layer has rules that are common between the flows.

`Rest:` Gateway to receive http calls from a configured endpoint, this layer should only redirect to the business layer in the case of the `orchestrator` module.

`application:` Manages all modules and application.yml
</br>

## Badges
<p>
<img alt="Static Badge" src="https:///img.shields.io/badge/java-v17-green">
<img alt="Static Badge" src="https:///img.shields.io/badge/SpringBoot-v3.3.3-blue">
<img alt="Static Badge" src="https:///img.shields.io/badge/Intellij-v2021.1.2-green">
</p>

## Requirements
You will need to following tools in order to work with this project and code:

* Java 17
* Maven
* IDE was used Intellij.

## Getting Started
To run this project locally, perform the following steps:

* Use this command to download the project to your machine: git clone git@gitlab.com:https://github.com/emmoro/modular_hexagonal](https://github.com/emmoro/modular_hexagonal.git
* To install all of its dependencies and start each app, follow the instructions below:
* To run the server. Application address: http://localhost:8080/v1/save and http://localhost:8080/v1/information
