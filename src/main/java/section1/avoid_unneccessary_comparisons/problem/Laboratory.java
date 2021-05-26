package section1.avoid_unneccessary_comparisons.problem;

import section1.Microscope;
import section1.Result;
import section1.Sample;

public class Laboratory {

    Microscope microscope;

    Result analyze(Sample sample){
        if (microscope.isInorganic(sample) == true){
            return Result.INORGANIC;
        } else {
            return analyzeOrganic(sample);
        }
    }

    private Result analyzeOrganic(Sample sample) {
        if (microscope.isHumanoid(sample) == false){
            return Result.ALIEN;
        } else {
            return Result.HUMANOID;
        }
    }
}
