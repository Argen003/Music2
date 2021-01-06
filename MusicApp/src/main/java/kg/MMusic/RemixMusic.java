package kg.MMusic;

import org.springframework.stereotype.Component;

@Component
public class RemixMusic implements Music{
    @Override
    public String getSong() {
        return "Ameno ameno ameno";
    }
}
