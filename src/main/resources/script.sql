CREATE TABLE `bootcamp`.`customer` (
  `cust_id` INT NULL,
  `name` VARCHAR(45) NULL,
  `age` INT NOT NULL,
  PRIMARY KEY (`cust_id`));


String driverName = "com.mysql.jdbc.Driver";
Class.forName(driverName).newInstance();
String connectionString = "jdbc:mysql://localhost:3306/bootcamp";
String username = "root";
String password = "root";
Connection connection = (Connection) DriverManager.getConnection(connectionString,
username, password);
PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM customer");
ResultSet resultSet = preparedStatement.executeQuery();
while (resultSet.next()) {
    System.out.println(resultSet.getString("name"));
}