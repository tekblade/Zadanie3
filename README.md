# After unziping change the folder name(delete "-master")
### Program odbiera dane o pozycji gps i zapisuje je do systemu(aplikacja typu REST)

### Running application:
### cd Zadanie3/mvn clean package/mvn spring-boot:run

### Dane odbierane od użytkowników systemu zapisujemy w Obiekcie typu Collection w czasie rzeczywistym działania programu.

### connecting with spring-boot based application by Program CURL

### Example request:
### curl -X POST  http://localhost:8080/localization \

### -H "Content-Type: application/json" \

### -d '{"deviceId":"125a545", "latitiude":5030, "longitude": 14412}'
