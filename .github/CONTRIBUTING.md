# Contributing to `hebcal-api`

:clap: First off, thank you for taking the time to contribute. :clap:

Contributing is pretty straight-forward:

- Fork the repository
- Commit your changes
- Create a pull request against the `master` branch

## Developing Information

- [Run Superlinter Locally](#run-superlinter-locally)
- [JPMS Project](#jpms-project)
- [Unit Testing](#unit-testing)
- [Mutation Testing](#mutation-testing)
- [Code of Conduct](#code-of-conduct)

### Run Superlinter Locally

```shell
docker run --rm -e RUN_LOCAL=true -e IGNORE_GITIGNORED_FILES=true -e IGNORE_GENERATED_FILES=true \
-e VALIDATE_EDITORCONFIG=true -e VALIDATE_GITHUB_ACTIONS=true -e VALIDATE_JAVA=true \
-e VALIDATE_JSON=true -e VALIDATE_MARKDOWN=true -e VALIDATE_XML=true -e VALIDATE_YAML=true -\
v ${PWD}:/tmp/lint ghcr.io/github/super-linter:slim-v4
```

### JPMS Project

This project leverage `JPMS`, note the
[module-info.java descriptior](../src/main/java/module-info.java),</br>
and the [module-info.test instructions file](../src/test/java/module-info.test).

### Unit Testing

Unit testing is written with [Junit 5](https://junit.org/junit5/) and a bunch of other cool tools and
frameworks,</br>
and executed with the [Platform Plugin](https://github.com/sormuras/junit-platform-maven-plugin).

### Mutation Testing

This project is configured for using [Pitest](https://pitest.org/) with the
[Descartes engine](https://github.com/STAMP-project/pitest-descartes).</br>
Although not passing mutation testing will not fail the build,</br>
It is encourged to be manually used in development stage to achive more reliable unit test results.

```shell
mvn pitest:mutationCoverage
```

