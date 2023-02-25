// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.FieldCommands;
import frc.robot.FieldSubsystems.*;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** Command that turns the field servo 90 degrees */
public class FieldServo90 extends CommandBase {
  private final FieldServo fs;

  public FieldServo90(FieldServo s) {
    fs = s;
    addRequirements(fs);    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    fs.turn90();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
