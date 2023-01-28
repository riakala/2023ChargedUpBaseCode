// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import frc.robot.RobotContainer;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class SetClaw extends CommandBase {

  double desired_speed = 0;
  /** Creates a new SetClaw. */
  public SetClaw(double speed) {
    desired_speed = speed; 
    addRequirements(RobotContainer.claw);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    RobotContainer.claw.SetClaw(desired_speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.claw.stopClaw();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}