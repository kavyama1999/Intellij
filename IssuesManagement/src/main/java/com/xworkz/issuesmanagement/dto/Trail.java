//@Service
//public class SignUpServiceImpl implements SignUpService {
//
//    @Autowired
//    private SignUpRepo signUpRepo;
//
//    @Autowired
//    private JavaMailSender mailSender;
//
//    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//    private static final int PASSWORD_LENGTH = 10;
//    private static final SecureRandom RANDOM = new SecureRandom();
//
//    public SignUpServiceImpl() {
//        System.out.println("No param Constructor in SignInServiceImpl");
//    }
//
//    @Override
//    public boolean saveAndValidate(SignUpDTO signUpDTO) {
//        System.out.println("saveAndValidate method running in SignInServiceImpl");
//        System.out.println("SetAudit value setting.............");
//
//        // Generate automatic password
//        String generatedPassword = generateRandomPassword();
//        signUpDTO.setPassword(generatedPassword);
//
//        // Set audit fields
//        String createdBy = "Kavya"; // or get the current user
//        LocalDateTime createdOn = LocalDateTime.now();
//
//        String updatedBy = "NA"; // or get the current user
//        LocalDateTime updatedOn = null;
//
//        boolean isActive = true;
//
//        setAudit(signUpDTO, createdBy, createdOn, updatedBy, updatedOn, isActive);
//
//        boolean data = this.signUpRepo.userDataSave(signUpDTO);
//        if (data) {
//            System.out.println("SignInRepo successful in SignInServiceImpl:" + signUpDTO);
//            return data;
//        } else {
//            System.out.println("SignInRepo not successful in SignInServiceImpl :" + signUpDTO);
//        }
//        return true;
//    }
//
//    @Override
//    public void setAudit(SignUpDTO signUpDTO, String createdBy, LocalDateTime createdOn, String updatedBy, LocalDateTime updatedOn, boolean isActive) {
//        System.out.println("setAudit method running in SignInServiceImpl..");
//        signUpDTO.setCreatedBy(createdBy);
//        signUpDTO.setCreatedOn(createdOn);
//        signUpDTO.setUpdatedBy(updatedBy);
//        signUpDTO.setUpdatedOn(updatedOn);
//        signUpDTO.setActive(isActive);
//    }
//
//    @Override
//    public String generateRandomPassword() {
//        StringBuilder sb = new StringBuilder(PASSWORD_LENGTH);
//        for (int i = 0; i < PASSWORD_LENGTH; i++) {
//            sb.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
//        }
//        return sb.toString();
//    }
//
//    @Override
//    public SignUpDTO findByEmailAndPassword(String email, String password) {
//        SignUpDTO user = signUpRepo.findByEmailAndPassword(email, password);
//        if (user != null && !user.isAccountLocked() && user.getPassword().equals(password)) {
//            return user;
//        }
//        return null;
//    }
//
//    @Override
//    public void sendPasswordEmail(String toEmail, String subject, String body) {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setTo(toEmail);
//        message.setSubject(subject);
//        message.setText(body);
//        message.setFrom("kmsrcb@gmail.com");
//
//        mailSender.send(message);
//    }
//
//    @Override
//    public void incrementFailedAttempts(String email) {
//        SignUpDTO user = signUpRepo.findByEmail(email);
//        if (user != null) {
//            int attempts = user.getFailedAttempt() + 1;
//            updateFailedAttempts(attempts, email);
//            if (attempts >= 3) {
//                lockAccount(email);
//            }
//        }
//    }
//
//    @Override
//    public int getFailedAttempts(String email) {
//        SignUpDTO user = signUpRepo.findByEmail(email);
//        return user != null ? user.getFailedAttempt() : 0;
//    }
//
//    @Override
//    public void resetFailedAttempts(String email) {
//        updateFailedAttempts(0, email);
//    }
//
//    @Override
//    public void lockAccount(String email) {
//        updateAccountLockedStatus(true, email);
//    }
//
//    @Override
//    public void updateFailedAttempts(int failedAttempts, String email) {
//        signUpRepo.updateFailedAttempts(failedAttempts, email);
//    }
//
//    @Override
//    public void updateAccountLockedStatus(boolean accountLocked, String email) {
//        signUpRepo.updateAccountLockedStatus(accountLocked, email);
//    }
//}
