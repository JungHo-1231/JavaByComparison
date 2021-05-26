package section1.avoid_unneccessary_comparisons.solution;

import section1.Microscope;
import section1.Result;
import section1.Sample;

public class Laboratory {

    Microscope microscope;

    Result analyze(Sample sample){
        if (microscope.isOrganic(sample)){
            return analyzeOrganic(sample);
        } else {
            return Result.INORGANIC;
        }
    }

    private Result analyzeOrganic(Sample sample) {
        if (microscope.isHumanoid(sample)){
            return Result.HUMANOID;
        } else {
            return Result.ALIEN;
        }
    }
}
