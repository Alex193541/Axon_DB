create database clinica;
CREATE TABLE Clientes (
    Id_clientes INT PRIMARY KEY,
    Nome_completo VARCHAR(100),
    Sexo VARCHAR(50),
    Telefone VARCHAR(50),
    Pagamento VARCHAR(50)
);



create table Serviços (
Id_serviço INT PRIMARY KEY,
Nome_do_serviço VARCHAR (100),
Valor_do_serviço DECIMAL (50),
Profissional_serviço VARCHAR (100),
Taxa_de_serviço DECIMAL (50)
);



create table Agendamento (
Id_agendamento INT PRIMARY KEY,
Data_agendamento DATETIME,
Horario_agendamento TIME,
Serviço_agendado VARCHAR (100),
Pagamento_taxa varchar (50)
);












