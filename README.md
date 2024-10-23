** Assignment Lab **

**Window API Details**

``/api/windows/{id} (GET)``
Payload: Fetch a window by its id.
Entity: Returns a Window object with id, name, windowStatus (OPEN, CLOSED, LOCKED), and roomId.

``/api/windows/{id} (PUT)``
Payload: Update a window's information by id with a Window object.
Entity: Returns the updated Window object with id, name, windowStatus, and roomId.

``/api/windows/{id} (DELETE)``
Payload: Delete a window by its id.
Entity: Returns OK on successful deletion.

``/api/windows (GET)``
Payload: Fetch all windows.
Entity: Returns a list of Window objects with id, name, windowStatus, and roomId.

``/api/windows (POST)``
Payload: Create a new window with a Window object.
Entity: Returns the created Window object with id, name, windowStatus, and roomId.




**Sensor API Details**

``/api/sensors/{id} (GET)``
Payload: Fetch a sensor by its id.
Entity: Returns a SensorDto object with id, name, value, and sensorType (TEMPERATURE, HUMIDITY, PRESSURE).

``/api/sensors/{id} (PUT)``
Payload: Update a sensor's information by id with a SensorDto object.
Entity: Returns the updated SensorDto object with id, name, value, and sensorType.

``/api/sensors/{id} (DELETE)``
Payload: Delete a sensor by its id.
Entity: Returns OK on successful deletion.

``/api/sensors (GET)``
Payload: Fetch all sensors.
Entity: Returns a list of SensorDto objects with id, name, value, and sensorType.

``/api/sensors (POST)``
Payload: Create a new sensor with a SensorDto object.
Entity: Returns the created SensorDto object with id, name, value, and sensorType.



**Room API Details**

``/api/rooms/{id} (GET)``
Payload: Fetch a room by its id.
Entity: Returns a Room object with id, name, and associated windows.

``/api/rooms/{id} (PUT)``
Payload: Update a room's information by id with a RoomEntity object.
Entity: Returns the updated Room object with id, name, and associated windows.

``/api/rooms/{id} (DELETE)``
Payload: Delete a room by its id.
Entity: Returns OK on successful deletion.

``/api/rooms (GET)``
Payload: Fetch all rooms.
Entity: Returns a list of Room objects with id, name, and associated windows.

``/api/rooms (POST)``
Payload: Create a new room with a RoomEntity object.
Entity: Returns the created Room object with id, name, and associated windows.
