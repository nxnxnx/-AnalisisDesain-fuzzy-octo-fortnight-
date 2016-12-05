$( document ).ready(function() {

    // Create device
    var device = new Device("arduino.local");

    // Button
    $('#on').click(function() {
      device.digitalWrite(8, 1);
    });

    $('#off').click(function() {
      device.digitalWrite(8, 0);
    });

    $('#on1').click(function() {
        device.digitalWrite(9, 1);
    });

    $('#off1').click(function() {
        device.digitalWrite(9, 0);
    });
});


