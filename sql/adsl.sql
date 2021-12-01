-- Table: comite
DROP TABLE IF EXISTS comite;
CREATE TABLE comite
(
    id       INT PRIMARY KEY,
    id_prog  TEXT,
    id_issue INT
);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (1, '1 2 3', 1);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (2, '1 2 3', 2);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (3, '1 2 3', 3);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (4, '1 2 3', 4);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (5, '4 5 6', 5);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (6, '4 5 6', 6);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (7, '4 5 6', 7);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (8, '4 5 6', 8);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (9, '4 5 6', 9);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (10, '7 8 9', 10);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (11, '7 8 9', 11);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (12, '7 8 9', 12);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (13, '10 11 12', 13);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (14, '10 11 12', 14);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (15, '10 11 12', 15);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (16, '13 14 15', 16);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (17, '13 14 15', 17);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (18, '13 14 15', 18);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (19, '1 2 3', 19);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (20, '1 2 3', 20);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (21, '1 2 3', 21);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (22, '1 2 3', 22);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (23, '4 5 6', 23);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (24, '4 5 6', 24);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (25, '4 5 6', 25);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (26, '4 5 6', 26);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (27, '7 8 9', 27);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (28, '7 8 9', 28);
INSERT INTO comite (id, id_prog, id_issue)
VALUES (29, '7 8 9', 29);

-- Table: commit
DROP TABLE IF EXISTS "commit";
CREATE TABLE "commit"
(
    id          INT PRIMARY KEY,
    id_prog     INT,
    id_repo     INT,
    id_proyecto INT,
    id_issue    INT,
    titulo      STRING,
    texto       TEXT,
    fecha       DATE
);
INSERT INTO "commit" (id, id_prog, id_repo, id_proyecto, id_issue, titulo, texto, fecha)
VALUES (1, 1, 1, 1, 2, 'Database Arreglado',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse massa justo, sodales ac nibh vel.',
        '2021-4-27');
INSERT INTO "commit" (id, id_prog, id_repo, id_proyecto, id_issue, titulo, texto, fecha)
VALUES (2, 1, 1, 1, 1, 'POJOS resueltos',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse massa justo, sodales ac nibh vel.',
        '2021-2-2');
INSERT INTO "commit" (id, id_prog, id_repo, id_proyecto, id_issue, titulo, texto, fecha)
VALUES (3, 2, 2, 2, 5, 'Archivo Creado',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam volutpat sollicitudin est, eget finibus urna.',
        '2021-3-23');
INSERT INTO "commit" (id, id_prog, id_repo, id_proyecto, id_issue, titulo, texto, fecha)
VALUES (4, 2, 2, 2, 6, 'Tabla Finalizada',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus suscipit pulvinar porta. In hac habitasse.',
        '2021-3-30');
INSERT INTO "commit" (id, id_prog, id_repo, id_proyecto, id_issue, titulo, texto, fecha)
VALUES (5, 3, 3, 3, 10, 'POJOS Finalizado',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam ligula ex, imperdiet at suscipit in.',
        '2021-5-15');
INSERT INTO "commit" (id, id_prog, id_repo, id_proyecto, id_issue, titulo, texto, fecha)
VALUES (6, 3, 3, 3, 11, 'Clase Creada',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam placerat diam in nunc mollis, vel.', '2021-4-17');
INSERT INTO "commit" (id, id_prog, id_repo, id_proyecto, id_issue, titulo, texto, fecha)
VALUES (7, 4, 4, 4, 13, 'DATABASE Finalizado', '
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur luctus, nunc sit amet sollicitudin feugiat.',
        '2021-5-30');
INSERT INTO "commit" (id, id_prog, id_repo, id_proyecto, id_issue, titulo, texto, fecha)
VALUES (8, 5, 5, 5, 16, 'Metodos Finalizados',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris et aliquet massa. Sed et imperdiet.',
        '2021-10-10');
INSERT INTO "commit" (id, id_prog, id_repo, id_proyecto, id_issue, titulo, texto, fecha)
VALUES (11, 6, 6, 6, 21, 'Clase Finalizado',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam erat turpis, accumsan et venenatis a.',
        '2021-11-20');
INSERT INTO "commit" (id, id_prog, id_repo, id_proyecto, id_issue, titulo, texto, fecha)
VALUES (10, 6, 6, 6, 20, 'Tablas Finalizado',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. In magna est, ornare id porttitor at.', '2021-10-15');
INSERT INTO "commit" (id, id_prog, id_repo, id_proyecto, id_issue, titulo, texto, fecha)
VALUES (9, 6, 6, 6, 19, 'POM Finalizado', '
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent lorem orci, ullamcorper id interdum ut.',
        '2021-10-1');
INSERT INTO "commit" (id, id_prog, id_repo, id_proyecto, id_issue, titulo, texto, fecha)
VALUES (12, 7, 7, 7, 23, 'POM Finalizado', '
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed mollis fermentum nunc vitae rhoncus. Vestibulum.',
        '2021-10-20');
INSERT INTO "commit" (id, id_prog, id_repo, id_proyecto, id_issue, titulo, texto, fecha)
VALUES (13, 7, 7, 7, 24, 'Clase Finalizado',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi odio justo, egestas eget placerat non.',
        '2022-4-15');
INSERT INTO "commit" (id, id_prog, id_repo, id_proyecto, id_issue, titulo, texto, fecha)
VALUES (14, 8, 8, 8, 27, 'Grafico Finalizado',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla vel tellus non orci cursus elementum.',
        '2022-3-1');
INSERT INTO "commit" (id, id_prog, id_repo, id_proyecto, id_issue, titulo, texto, fecha)
VALUES (15, 8, 8, 8, 28, 'Tabla Finalizado',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque vulputate quam eget tincidunt tristique. Cras.',
        '2022-4-15');

-- Table: departamento
DROP TABLE IF EXISTS departamento;
CREATE TABLE departamento
(
    id          INT PRIMARY KEY,
    id_jefe     INT,
    nombre      STRING,
    presupuesto DOUBLE
);
INSERT INTO departamento (id, id_jefe, nombre, presupuesto)
VALUES (1, 24, 'Sistemas', 140000.0);
INSERT INTO departamento (id, id_jefe, nombre, presupuesto)
VALUES (2, 25, 'Redes', 95000.0);
INSERT INTO departamento (id, id_jefe, nombre, presupuesto)
VALUES (3, 26, 'Soporte', 85000.0);
INSERT INTO departamento (id, id_jefe, nombre, presupuesto)
VALUES (4, 27, 'Data', 105000.0);

-- Table: equipo
DROP TABLE IF EXISTS equipo;
CREATE TABLE equipo
(
    id         INT PRIMARY KEY,
    id_prog     TEXT,
    id_proyecto TEXT
);
INSERT INTO equipo (id, id_prog, id_proyecto)
VALUES (1, '1 2 3', '1 6');
INSERT INTO equipo (id, id_prog, id_proyecto)
VALUES (5, '13 14 15', '5');
INSERT INTO equipo (id, id_prog, id_proyecto)
VALUES (2, '4 5 6', '2 7');
INSERT INTO equipo (id, id_prog, id_proyecto)
VALUES (3, '7 8 9', '3 8');
INSERT INTO equipo (id, id_prog, id_proyecto)
VALUES (4, '10 11 12', '4');

-- Table: issue
DROP TABLE IF EXISTS issue;
CREATE TABLE issue
(
    id        INT PRIMARY KEY,
    id_jefe   INT,
    id_commit INT,
    id_repo   INT,
    id_comite INT,
    titulo    STRING,
    texto     TEXT,
    fecha     DATE,
    estado    BOOLEAN
);
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (1, 1, 1, 1, 1, 'Resolver POJOS',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse massa justo, sodales ac nibh vel.',
        '2021-1-2', 'false');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (2, 1, 2, 1, 2, 'Arreglar Database',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris efficitur sollicitudin tellus dictum suscipit. Integer.',
        '2021-4-3', 'false');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (3, 1, 3, 1, 3, 'Corregir POM',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis id risus bibendum, lacinia mauris non.',
        '2021-5-4', 'true');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (4, 1, 4, 1, 4, 'Crear Clase',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse libero dui, auctor vitae suscipit placerat.',
        '2021-6-5', 'true');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (5, 2, 1, 2, 5, 'Crear Archivo', '
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque rutrum lectus ac urna mattis mattis.', '2021-3-22',
        'false');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (6, 2, 2, 2, 6, 'Crear Tabla',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum at nunc et turpis mattis vestibulum.',
        '2021-3-24', 'false');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (7, 2, 3, 2, 7, 'Crear Grafico', '
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam in lobortis orci. Proin faucibus quam.', '2021-3-26',
        'true');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (8, 2, 4, 2, 8, 'Arreglar Main',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec tempor felis venenatis mattis sollicitudin. Vestibulum.',
        '2021-3-28', 'true');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (9, 2, 5, 2, 9, 'Arreglar Archivo',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam a nisl eget est fringilla mollis.', '2021-3-29',
        'true');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (12, 3, 1, 3, 12, 'Modificar Clase',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus ac purus sit amet dui pulvinar.', '2021-4-5',
        'false');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (10, 3, 2, 3, 10, 'Arreglar POJOS',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam in justo mollis, vehicula mi placerat.',
        '2021-5-6', 'false');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (11, 3, 3, 3, 11, 'Crear Clase',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec iaculis scelerisque neque id pretium. Donec.',
        '2021-6-8', 'true');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (13, 4, 1, 4, 13, 'Crear Database',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. In aliquam vehicula est, ut faucibus erat.',
        '2021-5-16', 'false');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (14, 4, 2, 4, 14, 'Arreglar Numeros',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec scelerisque enim eros, a tempor arcu.',
        '2021-6-15', 'true');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (15, 4, 3, 4, 15, 'Cambiar Datos',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis porttitor arcu id dui convallis, ac.',
        '2021-7-15', 'true');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (16, 5, 1, 5, 16, 'Crear metodos',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur et ipsum tellus. Donec id lacus.',
        '2021-10-8', 'false');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (17, 5, 2, 5, 17, 'Modificar Condicionales',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nec turpis vehicula, dignissim lectus ac.',
        '2021-11-9', 'true');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (18, 5, 3, 5, 18, 'Crear Tabla',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean dapibus, mi in lobortis laoreet, odio.',
        '2021-12-5', 'true');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (19, 6, 1, 6, 19, 'Modificar POM', '
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse enim diam, luctus at neque eu.', '2021-9-1',
        'false');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (20, 6, 2, 6, 20, 'Modificacion Tablas',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam placerat ut metus ac dapibus. Donec.',
        '2021-10-1', 'false');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (21, 6, 3, 6, 21, 'Crear Clase',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut tincidunt ante et porttitor laoreet. Integer.',
        '2021-11-1', 'false');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (22, 6, 4, 6, 22, 'Crear Condicionales',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse cursus vitae est ac laoreet. In.',
        '2021-12-1', 'true');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (23, 7, 1, 7, 23, 'Corregir POM', '
Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum accumsan elit eros, a molestie arcu.', '2021-10-10',
        'false');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (24, 7, 2, 7, 24, 'Crear Clase',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin mauris sem, aliquam mollis massa id.',
        '2021-11-10', 'false');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (25, 7, 3, 7, 25, 'Arreglar POJOS',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris sit amet dignissim metus, pellentesque pellentesque.',
        '2021-12-15', 'true');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (26, 7, 4, 7, 26, 'Crear Archivo',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec et lectus libero. Fusce quis tincidunt.',
        '2022-1-1', 'true');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (27, 8, 1, 8, 27, 'Crear Grafico',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas luctus, nulla a interdum mollis, elit.',
        '2022-2-1', 'false');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (28, 8, 2, 8, 28, 'Crear Grafico',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce ut nibh vulputate, tempus turpis at.',
        '2022-3-15', 'false');
INSERT INTO issue (id, id_jefe, id_commit, id_repo, id_comite, titulo, texto, fecha, estado)
VALUES (29, 8, 3, 8, 29, 'Arreglar POJOS',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus quis leo leo. Phasellus augue purus.',
        '2022-4-16', 'true');

-- Table: jefe
DROP TABLE IF EXISTS jefe;
CREATE TABLE jefe
(
    id          INT PRIMARY KEY,
    id_proyecto INT,
    id_prog,
    id_issue    TEXT
);
INSERT INTO jefe (id, id_proyecto, id_prog, id_issue)
VALUES (1, 1, 16, '1 2 3 4');
INSERT INTO jefe (id, id_proyecto, id_prog, id_issue)
VALUES (2, 2, 17, '5 6 7 8 9');
INSERT INTO jefe (id, id_proyecto, id_prog, id_issue)
VALUES (3, 3, 18, '10 11 12');
INSERT INTO jefe (id, id_proyecto, id_prog, id_issue)
VALUES (4, 4, 19, '13 14 15');
INSERT INTO jefe (id, id_proyecto, id_prog, id_issue)
VALUES (5, 5, 20, '16 17 18');
INSERT INTO jefe (id, id_proyecto, id_prog, id_issue)
VALUES (6, 6, 21, '19 20 21 22');
INSERT INTO jefe (id, id_proyecto, id_prog, id_issue)
VALUES (7, 7, 22, '23 24 25 26');
INSERT INTO jefe (id, id_proyecto, id_prog, id_issue)
VALUES (8, 8, 23, '27 28 29');

-- Table: programador
DROP TABLE IF EXISTS programador;
CREATE TABLE programador
(
    id           INT PRIMARY KEY,
    id_equipo    INT,
    id_dpt       INT,
    id_commit    TEXT,
    id_comite    TEXT,
    id_issue     TEXT,
    nombre       STRING,
    conocimiento STRING,
    fecha_alta   DATE,
    salario      DOUBLE
);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (2, 1, 2, '3 4', '1 2 3 4 19 20 21 22', '1 2 3 4 19 20 21 22', 'Luis', 'kotlin', '2021-1-2', 1500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (1, 1, 1, '1 2', '1 2 3 4 19 20 21 22', '1 2 3 4 19 20 21 22', 'Juan', 'java', '2021-1-1', 1500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (3, 1, 3, '5 6', '1 2 3 4 19 20 21 22', '1 2 3 4 19 20 21 22', 'Alfondo', 'sql', '2021-1-3', 1500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (4, 2, 4, '7', '5 6 7 8 9 23 24 25 26', '5 6 7 8 9 23 24 25 26', 'Mario', 'java', '2021-2-1', 1500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (5, 2, 1, '8', '5 6 7 8 9 23 24 25 26', '5 6 7 8 9 23 24 25 26', 'Jaime', 'css', '2021-2-2', 1500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (6, 2, 2, '9 10 11', '5 6 7 8 9 23 24 25 26', '5 6 7 8 9 23 24 25 26', 'Alejandro', 'c', '2021-2-3', 1500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (7, 3, 3, '12 13', '10 11 12 27 28 29', '10 11 12 27 28 29', 'Jaime', 'php', '2021-1-2', 1500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (9, 3, 1, NULL, '10 11 12 27 28 29', '10 11 12 27 28 29', 'Alfredo', 'go', '2021-5-1', 1500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (8, 3, 4, '14 15', '10 11 12 27 28 29', '10 11 12 27 28 29', 'Sebas', 'ruby', '2021-3-1', 1500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (10, 4, 2, NULL, '13 14 15', '13 14 15', 'Emilio', 'python', '2021-6-3', 1500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (11, 4, 3, NULL, '13 14 15', '13 14 15', 'Saul', 'sql', '2021-6-2', 1500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (12, 4, 4, NULL, '13 14 15', '13 14 15', 'Sergio', 'javascript', '2021-6-1', 1500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (14, 5, 2, NULL, '16 17 18', '16 17 18', 'Federico', 'c', '2021-9-2', 1500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (15, 5, 3, NULL, '16 17 18', '16 17 18', 'Andrea', 'ruby', '2021-9-3', 1500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (13, 5, 1, NULL, '16 17 18', '16 17 18', 'Antonio', 'css', '2021-9-1', 1500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (16, NULL, 4, NULL, NULL, '1 2 3 4', 'Richard', 'kotlin', '2020-1-1', 2500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (17, NULL, 1, NULL, NULL, '5 6 7 8 9', 'Cristiano', 'java', '2020-1-2', 2500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (18, NULL, 2, NULL, NULL, '10 11 12', 'Ismael', 'sql', '2020-1-3', 2500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (19, NULL, 3, NULL, NULL, '13 14 15', 'Rafael', 'css', '2020-1-4', 2500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (20, NULL, 4, NULL, NULL, '16 17 18', 'Antonio', 'c', '2020-1-5', 2500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (21, NULL, 1, NULL, NULL, '19 20 21 22', 'Gabriela', 'php', '2020-1-6', 2500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (22, NULL, 2, NULL, NULL, '23 24 25 26', 'Susana', 'phyton', '2020-1-7', 2500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (23, NULL, 3, NULL, NULL, '27 28 29', 'Monica', 'ruby', '2020-1-8', 2500.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (24, NULL, 1, NULL, NULL, NULL, 'Laura', 'kotlin', '2020-1-1', 3000.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (25, NULL, 2, NULL, NULL, NULL, 'Jessica', 'css', '2020-1-2', 3000.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (26, NULL, 3, NULL, NULL, NULL, 'Maria', 'ruby', '2020-1-3', 3000.0);
INSERT INTO programador (id, id_equipo, id_dpt, id_commit, id_comite, id_issue, nombre, conocimiento, fecha_alta,
                         salario)
VALUES (27, NULL, 4, NULL, NULL, NULL, 'Raul', 'pascal', '2020-1-4', 3000.0);

-- Table: proyecto
DROP TABLE IF EXISTS proyecto;
CREATE TABLE proyecto
(
    id            INT PRIMARY KEY,
    id_jefe       INT,
    id_equipo     INT,
    id_dpt        INT,
    id_repo INT,
    nombre        STRING,
    presupuesto   DOUBLE,
    fecha_ini     DATE,
    fecha_fin     DATE,
    tecnologias   STRING
);
INSERT INTO proyecto (id, id_jefe, id_equipo, id_dpt, id_repo, nombre, presupuesto, fecha_ini, fecha_fin,
                      tecnologias)
VALUES (8, 23, 3, 4, 8, 'Deilop', 75000.0, '2022-1-20', '2022-6-18', 'Laravel');
INSERT INTO proyecto (id, id_jefe, id_equipo, id_dpt, id_repo, nombre, presupuesto, fecha_ini, fecha_fin,
                      tecnologias)
VALUES (1, 16, 1, 1, 1, 'Casus', 50000.0, '2021-1-1', '2021-6-20', 'Spring');
INSERT INTO proyecto (id, id_jefe, id_equipo, id_dpt, id_repo, nombre, presupuesto, fecha_ini, fecha_fin,
                      tecnologias)
VALUES (2, 17, 2, 2, 2, 'Pagasus', 10000.0, '2021-3-20', '2021-4-20', 'Laravel');
INSERT INTO proyecto (id, id_jefe, id_equipo, id_dpt, id_repo, nombre, presupuesto, fecha_ini, fecha_fin,
                      tecnologias)
VALUES (3, 18, 3, 3, 3, 'Filtrex', 70000.0, '2021-4-3', '2021-11-20', 'Django');
INSERT INTO proyecto (id, id_jefe, id_equipo, id_dpt, id_repo, nombre, presupuesto, fecha_ini, fecha_fin,
                      tecnologias)
VALUES (4, 19, 4, 4, 4, 'Viguo', 30000.0, '2021-5-15', '2021-8-11', 'Angular');
INSERT INTO proyecto (id, id_jefe, id_equipo, id_dpt, id_repo, nombre, presupuesto, fecha_ini, fecha_fin,
                      tecnologias)
VALUES (5, 20, 5, 1, 5, 'Arteros', 90000.0, '2021-7-8', '2022-2-26', 'Ruby');
INSERT INTO proyecto (id, id_jefe, id_equipo, id_dpt, id_repo, nombre, presupuesto, fecha_ini, fecha_fin,
                      tecnologias)
VALUES (6, 21, 1, 2, 6, 'Brugio', 85000.0, '2021-8-1', '2022-3-9', 'Express');
INSERT INTO proyecto (id, id_jefe, id_equipo, id_dpt, id_repo, nombre, presupuesto, fecha_ini, fecha_fin,
                      tecnologias)
VALUES (7, 22, 2, 3, 7, 'Vix', 15000.0, '2021-9-10', '2022-4-23', 'Spring');

-- Table: repositorio
DROP TABLE IF EXISTS repositorio;
CREATE TABLE repositorio
(
    id            INT PRIMARY KEY,
    id_proyecto   INT,
    id_commit     INT,
    id_issue      TEXT,
    nombre        STRING,
    fechaCreacion DATE
);
INSERT INTO repositorio (id, id_proyecto, id_commit, id_issue, nombre, fechaCreacion)
VALUES (1, 1, 16, '1 2 3 4', 'Casus-repo', '2021-1-1');
INSERT INTO repositorio (id, id_proyecto, id_commit, id_issue, nombre, fechaCreacion)
VALUES (3, 3, 18, '10 11 12', 'Filtrex-repo', '2021-4-3');
INSERT INTO repositorio (id, id_proyecto, id_commit, id_issue, nombre, fechaCreacion)
VALUES (4, 4, 19, '13 14 15', 'Viguo-repo', '2021-5-15');
INSERT INTO repositorio (id, id_proyecto, id_commit, id_issue, nombre, fechaCreacion)
VALUES (5, 5, 20, '16 17 18', 'Arteros-repo', '2021-7-8');
INSERT INTO repositorio (id, id_proyecto, id_commit, id_issue, nombre, fechaCreacion)
VALUES (6, 6, 21, '19 20 21 22', 'Brugio-repo', '2021-8-1');
INSERT INTO repositorio (id, id_proyecto, id_commit, id_issue, nombre, fechaCreacion)
VALUES (7, 7, 22, '23 24 25 26', 'Vix-repo', '2021-9-10');
INSERT INTO repositorio (id, id_proyecto, id_commit, id_issue, nombre, fechaCreacion)
VALUES (8, 8, 23, '27 28 29', 'Deilop-repo', '2022-1-20');
INSERT INTO repositorio (id, id_proyecto, id_commit, id_issue, nombre, fechaCreacion)
VALUES (2, 2, 17, '5 6 7 8 9', 'Pagasus-repo', '2021-3-20');
