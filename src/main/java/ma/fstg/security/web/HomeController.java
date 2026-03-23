package ma.fstg.security.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        // Plain text endpoints make access control easy to verify in a browser.
        return "Page d'accueil accessible apres connexion.";
    }

    @GetMapping("/user/dashboard")
    public String userDashboard() {
        return "Espace utilisateur - accessible aux roles USER et ADMIN.";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "Espace administrateur - reserve au role ADMIN.";
    }
}
