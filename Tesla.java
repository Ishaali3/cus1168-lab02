public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    // Constructor
    public Tesla(String model, int year) {
        super("Tesla", model, year);
        this.autopilotEnabled = false;
        this.charging = false;
    }

    // Implement abstract methods from Vehicle
    @Override
    public void startEngine() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(make + " " + model + " started");
        } else {
            System.out.println(make + " " + model + " is already running");
        }
    }

    @Override
    public void stopEngine() {
        if (isRunning) {
            isRunning = false;
            System.out.println(make + " " + model + " stopped");
        } else {
            System.out.println(make + " " + model + " is already off");
        }
    }

    @Override
    public void accelerate() {
        if (isRunning) {
            System.out.println(make + " " + model + " is accelerating...");
        } else {
            System.out.println("Cannot accelerate. " + make + " " + model + " is off.");
        }
    }

    @Override
    public void brake() {
        if (isRunning) {
            System.out.println(make + " " + model + " is braking...");
        } else {
            System.out.println("Cannot brake. " + make + " " + model + " is off.");
        }
    }

    // Implement methods from Electric interface
    @Override
    public void charge() {
        charging = true;
        System.out.println(make + " " + model + " is now charging");
    }

    @Override
    public boolean isCharging() {
        return charging;
    }

    // Implement methods from Autonomous interface
    @Override
    public void enableAutopilot() {
        autopilotEnabled = true;
        System.out.println("Autopilot enabled");
    }

    @Override
    public void disableAutopilot() {
        autopilotEnabled = false;
        System.out.println("Autopilot disabled");
    }

    @Override
    public boolean isAutopilotEnabled() {
        return autopilotEnabled;
    }
}
