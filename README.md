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
