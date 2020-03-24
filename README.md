## OpenFaaS Template

The Java11 template uses gradle as a build system.

Create functions by **forking** this function and renaming **my-function** yaml 
and inside yaml for you function name.

## Usage

First you need to load templates to start working with *OpenFaaS*

Run this command:

```shell script
faas-cli build -f ./my-function.yml
```

### Deploy

```shell script
faas-cli deploy -f ./my-function.yml
```

### Handler

The handler is written in the `./src/main/Handler.java` folder

Tests are supported with junit via files in `./src/test`

