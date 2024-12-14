package csc213.cse213_finalproject_group21_bksp.mizi.Athlete;

import java.util.List;

public class AthleteController {
    private AthleteService athleteService;


    public AthleteController(AthleteService athleteService) {
        this.athleteService = athleteService;
    }


    public void registerForTrainingSession(String athleteId, TrainingSession session) {
        athleteService.addTrainingSession(athleteId, session);
    }

    public void trackPerformanceMetrics(String athleteId, PerformanceMetric metric) {
        athleteService.addPerformanceMetric(athleteId, metric);
    }

    public void updateNutritionPlan(String athleteId, NutritionPlan plan) {
        athleteService.setNutritionPlan(athleteId, plan);
    }

    public void updateWorkoutPlan(String athleteId, WorkoutPlan plan) {
        athleteService.setWorkoutPlan(athleteId, plan);
    }

    public void requestFeedbackFromCoach(String athleteId, CoachFeedback feedbackRequest) {
        athleteService.addCoachFeedbackRequest(athleteId, feedbackRequest);
    }

    public void requestMedicalSupport(String athleteId, MedicalSupport medicalSupportRequest) {
        athleteService.addMedicalSupportRequest(athleteId, medicalSupportRequest);
    }

    public void requestForFinancialAid(String athleteId, FinancialAidRequest financialAidRequest) {
        athleteService.addFinancialAidRequest(athleteId, financialAidRequest);
    }

    public void registerForEvents(String athleteId, Event event) {
        athleteService.addEventRegistration(athleteId, event);
    }

    public List<Event> checkUpcomingEvents(String athleteId) {
        return athleteService.getUpcomingEvents(athleteId);
    }

    public void updatePersonalProfile(String athleteId, PersonalProfile profile) {
        athleteService.updatePersonalProfile(athleteId, profile);
    }

    public List<Sponsor> viewCurrentSponsors(String athleteId) {
        return athleteService.getCurrentSponsors(athleteId);
    }

