package com.brms.client;

import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.AgendaEventListener;
import org.kie.api.event.rule.AgendaGroupPoppedEvent;
import org.kie.api.event.rule.AgendaGroupPushedEvent;
import org.kie.api.event.rule.BeforeMatchFiredEvent;
import org.kie.api.event.rule.MatchCancelledEvent;
import org.kie.api.event.rule.MatchCreatedEvent;
import org.kie.api.event.rule.RuleFlowGroupActivatedEvent;
import org.kie.api.event.rule.RuleFlowGroupDeactivatedEvent;
import org.kie.api.runtime.KieSession;

public class ceoEngineListner implements AgendaEventListener{

	private ResponseHander responseHanlde = ResponseHander.getInstance();
	
	public void matchCreated(MatchCreatedEvent event) {
		
		((KieSession)event.getKieRuntime()).fireAllRules();
	}

	public void matchCancelled(MatchCancelledEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void beforeMatchFired(BeforeMatchFiredEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void afterMatchFired(AfterMatchFiredEvent event) {
		// TODO Auto-generated method stub
		//event.getMatch().getObjects();
		//event.getMatch().
		responseHanlde.addResponse(event);
	}

	public void agendaGroupPopped(AgendaGroupPoppedEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void agendaGroupPushed(AgendaGroupPushedEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
		// TODO Auto-generated method stub
		
	}

}
