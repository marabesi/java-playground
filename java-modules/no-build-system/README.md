## Modules

### compiling

javac -d out --module-source-path src --module com.acme.stringutil

### running

java --module-path out --module com.acme.stringutil/common.Main
