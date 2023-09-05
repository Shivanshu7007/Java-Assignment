// Create a deal
@ResController
@RequestMapping("/deals")
public class DealControl{

    private DealService dealService;
    public deal createdeal(RequestMapping DealDT0 dealDT0){
        return dealService.createDeal(dealDT0);


    }
}
@Service
public class DealService{
    private Deal1 deal2;
    public Deal createDeal(DealDT0 dealDT0){
        Deal deal= new Deal(dealDT0.getPrice(),dealDT0.getMaxItem(), dealDT0.getEndTime());
        return deal2.save(deal);
    }

}
@Entity
public class Deal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigBecimal price;
    private int maxItem;
    private LocalDateTime endTime;
}
public class DealDT0{
    private BigDecimal price;
    private int maxItem;
    private LocalDate endTime;
}

 // End a deal

@ResController
@RequestMapping("/deals")
public class DealControl{
    public ResponseEntity<String> endDeal(@PathVariable Long dealId){
        dealService.endDeal(dealId);
        return ResoinseEntity.ok("Deal ended successFully.");
    
    }
}
public class DealService{
    public void endDeal(Long dealId){
        Deal deal= deal2.findById(dealID)
        .orElseThrow(()=new NotFoundException("Deal not found"));
        deal.setEndTime(LocalDateTime.now());
        deal2.save(deal);
    }
}
 // Update a Deal
 @ResController
@RequestMapping("/deals")
public class DealControl{
public DealupdateDeal (@PathVariable Long dealId, @RequestBody DealDT0 dealDT0)
{
    return dealService.updateDeal(dealId, dealDT0);
}
}
@service
public class DealService{
    public void endDeal(Long dealId, DealDT0 dealDT0){
        Deal deal = deal2.findByID(dealId)
        .orElseThrow(()=new NotFoundException("Deal not found"));
        deal.setMaxItem(dealDT0.getMaxItem());
        deal.setEndTime(dealDT0.getEndTime());
        return deal2.save(deal);
    }
}







