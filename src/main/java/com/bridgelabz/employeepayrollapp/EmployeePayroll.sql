mysql> use payroll_db;
Database changed

mysql> show tables;
+----------------------+
| Tables_in_payroll_db |
+----------------------+
| employee_department  |
| employee_payroll     |
| hibernate_sequence   |
+----------------------+
3 rows in set (0.00 sec)

mysql> desc employee_department;
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| id         | int          | NO   | MUL | NULL    |       |
| department | varchar(255) | YES  |     | NULL    |       |
+------------+--------------+------+-----+---------+-------+
2 rows in set (0.12 sec)

mysql> desc employee_payroll;
+-------------+--------------+------+-----+---------+-------+
| Field       | Type         | Null | Key | Default | Extra |
+-------------+--------------+------+-----+---------+-------+
| employee_id | int          | NO   | PRI | NULL    |       |
| gender      | varchar(255) | YES  |     | NULL    |       |
| name        | varchar(255) | YES  |     | NULL    |       |
| note        | varchar(255) | YES  |     | NULL    |       |
| profile_pic | varchar(255) | YES  |     | NULL    |       |
| salary      | bigint       | YES  |     | NULL    |       |
| start_date  | date         | YES  |     | NULL    |       |
+-------------+--------------+------+-----+---------+-------+
7 rows in set (0.05 sec)

mysql> select * from employee_payroll;
+-------------+--------+--------+-------------+-----------------------------------------+---------+------------+
| employee_id | gender | name   | note        | profile_pic                             | salary  | start_date |
+-------------+--------+--------+-------------+-----------------------------------------+---------+------------+
|           1 | male   | Prince | All is well | ../assets/profile-images/Ellipse -3.png | 4579999 | 2019-10-29 |
+-------------+--------+--------+-------------+-----------------------------------------+---------+------------+
1 row in set (0.00 sec)

mysql> select * from hibernate_sequence;
+----------+
| next_val |
+----------+
|        2 |
+----------+
1 row in set (0.00 sec)

mysql> select * from employee_department;
+----+------------+
| id | department |
+----+------------+
|  1 | HR         |
|  1 | finance    |
+----+------------+
2 rows in set (0.00 sec)