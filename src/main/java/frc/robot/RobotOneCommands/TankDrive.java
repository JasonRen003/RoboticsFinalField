// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.RobotOneCommands;
import frc.robot.RobotOneSubsystems.*;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class TankDrive extends CommandBase {
  private final DriveTalons tOne;
  private final XboxController controller;

  public TankDrive(DriveTalons t, XboxController c) {
    tOne = t;
    controller = c;
    addRequirements(tOne);    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //tOne.tankDrive(-controller.getLeftY(), -controller.getRightY());
    tOne.tankDrive(-controller.getLeftY(), -controller.getRawAxis(3)); //getRightY isn't getting right stick input
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
