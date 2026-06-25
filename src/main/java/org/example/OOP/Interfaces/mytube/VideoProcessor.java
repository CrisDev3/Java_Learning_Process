package org.example.OOP.Interfaces.mytube;

public class VideoProcessor {
    private final VideoEncoder encoder;
    private final VideoDatabase database;
    private final EmailService emailService;

    public VideoProcessor(
            VideoEncoder encoder,
            VideoDatabase database,
            EmailService emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}
