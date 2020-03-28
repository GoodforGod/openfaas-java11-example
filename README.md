## OpenFaaS Template

The Java11 template uses gradle as a build system.

Create functions by **forking** this function and renaming **openfaas-template** yaml 
and inside yaml for you function name.

## Usage

First you need to load templates to start working with *OpenFaaS*

Run this command:

```shell script
faas-cli build -f ./function-local.yml
```

### Deploy

```shell script
faas-cli deploy -f ./function-local.yml
```

### Structure

Package structure should remain the same so templates *entrypoint* code that creates 
handler will be created correctly from this package as specified per *template*.

Correct package name for *Handler* is default one *com.openfaas.function*

### Handler

The handler is written in the `./src/main/Handler.java` folder

Tests are supported with junit via files in `./src/test`

