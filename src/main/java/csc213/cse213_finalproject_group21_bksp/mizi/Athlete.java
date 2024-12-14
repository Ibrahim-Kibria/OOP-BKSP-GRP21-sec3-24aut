package csc213.cse213_finalproject_group21_bksp.mizi;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an Athlete with attributes and relationships to manage their workflows.
 */
public class Athlete {
    private String id;
    private String name;
    private String dob;
    private String email;
    private String contactInfo;

    // Relationships
    private List<TrainingSession> trainingSessions = newArrayList<TrainingSession>();
    private NutritionPlan nutritionPlan;
    private WorkoutPlan workoutPlan;
    private List<PerformanceMetric> performanceMetrics = newArrayList<>();
    private List<Event> events = newArrayList<>();
    private List<Feedback> feedbacks = new rrayList<>();
    private List<AppointmentRequest> appointmentRequests = newArrayList<>();
    private List<FinancialAidRequest> financialAidRequests = new ArrayList<>();

    // Constructor
    public Athlete(String id, String name, String dob, String email, String contactInfo) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.contactInfo = contactInfo;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<TrainingSession> getTrainingSessions() {
        return trainingSessions;
    }

    public void setTrainingSessions(List<TrainingSession> trainingSessions) {
        this.trainingSessions = trainingSessions;
    }

    public NutritionPlan getNutritionPlan() {
        return nutritionPlan;
    }

    public void setNutritionPlan(NutritionPlan nutritionPlan) {
        this.nutritionPlan = nutritionPlan;
    }

    public WorkoutPlan getWorkoutPlan() {
        return workoutPlan;
    }

    public void setWorkoutPlan(WorkoutPlan workoutPlan) {
        this.workoutPlan = workoutPlan;
    }

    public List<PerformanceMetric> getPerformanceMetrics() {
        return performanceMetrics;
    }

    public void setPerformanceMetrics(List<PerformanceMetric> performanceMetrics) {
        this.performanceMetrics = performanceMetrics;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public List<AppointmentRequest> getAppointmentRequests() {
        return appointmentRequests;
    }

    public void setAppointmentRequests(List<AppointmentRequest> appointmentRequests) {
        this.appointmentRequests = appointmentRequests;
    }

    public List<FinancialAidRequest> getFinancialAidRequests() {
        return financialAidRequests;
    }

    public void setFinancialAidRequests(List<FinancialAidRequest> financialAidRequests) {
        this.financialAidRequests = financialAidRequests;
    }

    public void updateProfile(String name, String email, String contactInfo) {
        this.name = name;
        this.email = email;
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }
}
