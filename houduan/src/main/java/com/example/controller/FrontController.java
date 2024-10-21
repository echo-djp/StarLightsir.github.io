package com.example.controller;import com.example.exception.CustomException;import com.example.common.Result;import com.example.common.ResultCode;import com.example.entity.*;import com.example.service.*;import com.example.service.impl.CollectServiceImpl;import com.example.vo.LepuxinxiVo;import com.example.vo.AihaozheVo;import com.example.vo.FasonglepuVo;import com.example.vo.GoumaiVo;import com.example.vo.ChuangzuozheVo;import com.example.vo.LepuleibieVo;import com.example.vo.BankuaiVo;import com.example.vo.TieziVo;import com.example.vo.PinglunVo;import com.example.vo.BianhuantuVo;import com.example.vo.XinwentongzhiVo;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.web.bind.annotation.*;import javax.annotation.Resource;import java.util.List;@RestController@RequestMapping(value = "/front")public class FrontController {    @Autowiredprivate LepuxinxiService  lepuxinxiService;@Autowiredprivate AihaozheService  aihaozheService;@Autowiredprivate FasonglepuService  fasonglepuService;@Autowiredprivate GoumaiService  goumaiService;@Autowiredprivate ChuangzuozheService  chuangzuozheService;@Autowiredprivate LepuleibieService  lepuleibieService;    @Autowired    private BankuaiService  bankuaiService;    @Autowired    private TieziService  tieziService;    @Autowired    private PinglunService pinglunService;	@Autowired    private BianhuantuService  bianhuantuService;    @Autowired    private XinwentongzhiService  xinwentongzhiService;    @Autowired    private LiuyanbanService liuyanbanService;    @Resource    private CollectServiceImpl collectService;	@GetMapping("/getlepuxinxidetail/{id}")public Result getlepuxinxidetail(@PathVariable Integer id) {	return Result.success(lepuxinxiService.findById(id));}@PostMapping("/lepuxinxi")public Result<LepuxinxiVo> lepuxinxi(@RequestBody LepuxinxiVo lepuxinxiVo) {return Result.success(lepuxinxiService.findPage(lepuxinxiVo));}@PostMapping("/zhuceaihaozhe")public Result zhuceaihaozhe(@RequestBody Aihaozhe aihaozhe) {aihaozheService.add(aihaozhe);return Result.success();}@PostMapping("/findaihaozheyonghuming")public Result findaihaozheyonghuming(@RequestBody Aihaozhe aihaozhe) {aihaozheService.findaihaozheyonghuming(aihaozhe);return Result.success();}@PostMapping("/loginaihaozhe")public Result loginaihaozhe(@RequestBody Aihaozhe aihaozhe) {return Result.success(aihaozheService.login(aihaozhe));}@GetMapping("/getgoumaidetail/{id}")public Result getgoumaidetail(@PathVariable Integer id) {	return Result.success(goumaiService.findById(id));}@PostMapping("/postgoumai")public Result<Goumai> postgoumai(@RequestBody Goumai goumai) {return Result.success(goumaiService.add(goumai));}@PostMapping("/zhucechuangzuozhe")public Result zhucechuangzuozhe(@RequestBody Chuangzuozhe chuangzuozhe) {chuangzuozheService.add(chuangzuozhe);return Result.success();}@PostMapping("/findchuangzuozhezhanghao")public Result findchuangzuozhezhanghao(@RequestBody Chuangzuozhe chuangzuozhe) {chuangzuozheService.findchuangzuozhezhanghao(chuangzuozhe);return Result.success();}@PostMapping("/loginchuangzuozhe")public Result loginchuangzuozhe(@RequestBody Chuangzuozhe chuangzuozhe) {return Result.success(chuangzuozheService.login(chuangzuozhe));}    @PostMapping("/bankuai")    public Result<BankuaiVo> bankuai(@RequestBody BankuaiVo bankuaiVo) {        return Result.success(bankuaiService.findPage(bankuaiVo));    }    @GetMapping("/gettiezidetail/{id}")    public Result<Tiezi> gettiezidetail(@PathVariable Integer id) {        return Result.success(tieziService.findById(id));    }    @PostMapping("/tiezi")    public Result<TieziVo> tiezi(@RequestBody TieziVo tieziVo) {        return Result.success(tieziService.findPage(tieziVo));    }    @PutMapping("/tiezi")    public Result tieziupdt(@RequestBody Tiezi tiezi) {        tieziService.update(tiezi);        return Result.success();    }    @PutMapping("/bankuai")    public Result bankuaiupdt(@RequestBody Bankuai bankuai) {        bankuaiService.update(bankuai);        return Result.success();    }    @GetMapping("/tiezi")    public Result tiezi() {        return Result.success(tieziService.list());    }    @PostMapping("/posttiezi")    public Result<Tiezi> posttiezi(@RequestBody Tiezi tiezi) {        return Result.success(tieziService.add(tiezi));    }     @PostMapping("/postlepuxinxi")    public Result<Lepuxinxi> postlepuxinxi(@RequestBody Lepuxinxi lepuxinxi) {        return Result.success(lepuxinxiService.add(lepuxinxi));    }	@PostMapping("/postpinglun")    public Result<Pinglun> postpinglun(@RequestBody Pinglun pinglun) {        return Result.success(pinglunService.add(pinglun));    }    @PostMapping("/pinglun")    public Result<PinglunVo> pinglun(@RequestBody PinglunVo pinglunVo) {        return Result.success(pinglunService.findPage(pinglunVo));    }		@GetMapping("/bianhuantu")    public Result bianhuantu() {        return Result.success(bianhuantuService.list());    }       @GetMapping("/xinwentongzhi")    public Result xinwentongzhi() {        return Result.success(xinwentongzhiService.list());    }    @GetMapping("/getxinwentongzhi/{id}")    public Result getxinwentongzhi(@PathVariable Integer id) {        return Result.success(xinwentongzhiService.findById(id));    }    @PostMapping("/addLiuyan")    public Result addComment(@RequestBody Liuyanban liuyanban) {        liuyanbanService.add(liuyanban);        return Result.success();    }    @GetMapping("/getLiuyan")    public Result<List<Liuyanban>> getCommentTiezi() {        return Result.success(liuyanbanService.getLiuyan());    }    @PostMapping("/addCollect")    public Result addCollect(@RequestBody Collect collect) {        Collect collect1 = collectService.add(collect);        if(collect1  == null){            return Result.success("请勿重复收藏");        }        return Result.success();    }    @DeleteMapping("/deleteCollect/{id}")    public Result deleteCollect(@PathVariable Integer id) {        collectService.delete(id);        return Result.success();    }	@PostMapping("/getUserCollect")    public Result getUserCollect(@RequestBody Collect collect) {        return Result.success(collectService.findFrontPages(collect.getUserId()));    }    @DeleteMapping("/deleteCollect/{id}/{userId}")    public Result deleteCollect(@PathVariable Integer id,@PathVariable Integer userId) {        collectService.deleteByUserId(id,userId);        return Result.success();    }		@PutMapping("/lepuxinxi")public Result updateLepuxinxi(@RequestBody LepuxinxiVo lepuxinxi) {lepuxinxiService.update(lepuxinxi);return Result.success();}@PutMapping("/aihaozhe")public Result updateAihaozhe(@RequestBody AihaozheVo aihaozhe) {aihaozheService.update(aihaozhe);return Result.success();}@PutMapping("/fasonglepu")public Result updateFasonglepu(@RequestBody FasonglepuVo fasonglepu) {fasonglepuService.update(fasonglepu);return Result.success();}@PutMapping("/goumai")public Result updateGoumai(@RequestBody GoumaiVo goumai) {goumaiService.update(goumai);return Result.success();}@PutMapping("/chuangzuozhe")public Result updateChuangzuozhe(@RequestBody ChuangzuozheVo chuangzuozhe) {chuangzuozheService.update(chuangzuozhe);return Result.success();}@PutMapping("/lepuleibie")public Result updateLepuleibie(@RequestBody LepuleibieVo lepuleibie) {lepuleibieService.update(lepuleibie);return Result.success();}}