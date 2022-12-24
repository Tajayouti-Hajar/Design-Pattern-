package tajayouti.example.service;


import org.springframework.stereotype.Service;
import tajayouti.example.aspects.Log;
import tajayouti.example.aspects.SecuredByAspect;

@Service
public class IMetierImpl implements IMetier {
    @Override
    @Log //journaliser la methode
    @SecuredByAspect(roles={"USER","ADMIN"}) //role
    public void process() {
        System.out.println("Processing...");
    }

    @Override
    @Log
    @SecuredByAspect(roles={"ADMIN"})
    public double compute() {
        double data = 80;
        System.out.println("Computing and Retirning Result");
        return data;
    }
}
