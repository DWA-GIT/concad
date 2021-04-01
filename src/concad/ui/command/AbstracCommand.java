package concad.ui.command;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IProject;

import concad.core.util.HelperProjects;


public abstract class AbstracCommand extends AbstractHandler {

  
  protected List<IProject> getSelectedProjects(ExecutionEvent event) {
    return HelperProjects.getSelectedProjects(event);
  }

  
  protected List<IProject> getListOfMonitoredProjects() {
    return HelperProjects.getMonitoredProjects();
  }

  
  protected void addProjectsToListOfMonitoredProjects(List<IProject> projects) {
    HelperProjects.addProjectsToListOfMonitoredProjects(projects);
  }

  
  protected void removeProjectsFromListOfMonitoredProjects(List<IProject> projects) {
    HelperProjects.removeProjectsFromListOfMonitoredProjects(projects);
  }

}
