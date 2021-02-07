package main;

public class East implements Direction {
    @Override
    public boolean appliesThisDirection(DirectionsEnum direction) {
        return (DirectionsEnum.E.equals(direction));
    }
    @Override
    public MarsRover moveForward(MarsRover rover) {
        return new MarsRover(rover.getX()+1, rover.getY(), rover.getDirection());
    }

    @Override
    public MarsRover moveBackWard(MarsRover rover) {
        return new MarsRover(rover.getX()-1, rover.getY()+1, rover.getDirection());
    }

    @Override
    public MarsRover turnRight(MarsRover rover) {
        return new MarsRover(rover.getX(), rover.getY(), DirectionsEnum.S);
    }

    @Override
    public MarsRover turnLeft(MarsRover rover) {
        return new MarsRover(rover.getX(), rover.getY(), DirectionsEnum.N);
    }
}