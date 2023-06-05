## Multiple Modules

### compiling
javac -d out/ --module-source-path src --module packt.addressbook,packt.sortutils

### running
java --module-path out --module packt.addressbook/main.Main